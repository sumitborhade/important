# OSI Model 
  Thanks to [TechTerms Youtube](https://www.youtube.com/watch?v=vv4y_uOneC0)

## Application layer: (Data)
	Protocols: HTTP, HTTPS, SFT, FTP, SMTP, POP, DHCP, TELNET

## Presentation layer: (Data)
	Protocols: SSL
	Functions:
		1. Translation (From Text to Machine readable)
		2. Data compression 
			a. Lossy
			b. Lossless
		3. Encryption/Decryption (Security reasons)

## Session layer: (Data)
	Functions:
		1. Session management
		2. Authentication
		3. Authorization

## Transport layer: (Segment)
	Protocols: TCP, UDP
	TCP: 
		1. Connection oriented 
		2. Used for: Email, WWW, SFTP
			
	UDP: Connectionless 
		1. Video/music streaming
		2. VoIP
		3. Gaming
	Functions:
		1. Segmentation: Divide data in segments
		2. Flow control:
		3. Error detection: Verify checksum

## Network layer: (Packet)
	Protocol: IP
	Functions:
		1. Create packets from segments 
		2. Logical addressing: Add source & destination IP Address
		3. Routing: Finding N/w & host address using subnet mask
		4. Path determination: 
			Protocols: OSPF, BGP, IS-IS

## Data layer: (Frame)
	Protocols: Ethernet, PPP ( Point 2 Point)
	Functions:
		1. Physical addressing: 
			a. Creates Frames from packets
			b. Add source & destination MAC address
			c. Add checksum
		2. Access the media: 
		3. Media access control:
			a. CSMA( Carries Sense Multiple Access)
			b. Error detection: Using checksum

## Physical layer: (Signals)
	Functions:
		1. Converts bits to Signals
		2. Transmits using cable, fibre optics or air

