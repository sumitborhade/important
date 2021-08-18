## Tiny Url:
### Functional Requirements 
1. System should be able to generate the tiny url for long url
2. Able to redirect the user to long url when entered tiny url in browser
3. Urls expiry

### Non-Functional Requirements:
1. High availability
2. Low latency
3. Scalability

### Extended requirements:
1. Rest API should be exposed
2. DDOS attacks should be avoided

### Capacity estimates
**Key point** _Write:  500M urls/month and Read will be 10x_

1. Write: 200 urls/sec
2. Read: 20,000 urls/sec
3. Total urls: 500M x 12 x 10years = 60B urls 
4. Storage: 60B x 500Bytes = 30TB 
5. Bandwidth for incoming data: 200 urls/s x 500bytes = 100kb/s
6. Bandwidth for outgoing data: 100kb/s x 100 = 10MB/s
7. Cache memory: 172.8GB

### System API












