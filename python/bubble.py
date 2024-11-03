def solution(bubbles):
    if not bubbles or not bubbles[0]:
        return bubbles
    
    rows = len(bubbles)
    cols = len(bubbles[0])
    
    directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    
    to_explode = set()
    
    for r in range(rows):
        for c in range(cols):
            if bubbles[r][c] == 0: 
                continue
            
            color = bubbles[r][c]
            neighbor_count = 0
            
            for dr, dc in directions:
                nr, nc = r + dr, c + dc
                if 0 <= nr < rows and 0 <= nc < cols and bubbles[nr][nc] == color:
                    neighbor_count += 1
            
            if neighbor_count >= 2:
                to_explode.add((r, c))
                for dr, dc in directions:
                    nr, nc = r + dr, c + dc
                    if 0 <= nr < rows and 0 <= nc < cols and bubbles[nr][nc] == color:
                        to_explode.add((nr, nc))
    
    for r, c in to_explode:
        bubbles[r][c] = 0
    
    for c in range(cols):
        write_index = rows - 1
        
        for r in range(rows - 1, -1, -1):
            if bubbles[r][c] != 0:
                bubbles[write_index][c] = bubbles[r][c]
                write_index -= 1
        
        for r in range(write_index, -1, -1):
            bubbles[r][c] = 0
            
    return bubbles