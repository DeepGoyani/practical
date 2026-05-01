# 1. Cloud Deployment & Service Model

## Deployment Model: Hybrid Cloud
- Private Cloud → store sensitive candidate data (privacy)
- Public Cloud → run scalable AI workloads (cost-efficient)

## Service Model:
- PaaS + IaaS (combined)
- PaaS → for app hosting, APIs, backend (fast development)
- IaaS → for GPU-based AI model training (heavy compute)

---

# 2. AI Processing Approach

## Hybrid Processing

### Batch Processing
- Resume screening, ranking (large volume, not urgent)

### Real-time Processing
- Interview scheduling, candidate responses

## Model Strategy
- Use pre-trained models + fine-tuning (reduces cost)
- Use GPU instances only when required (auto-scale)

---

# 3. Storage + Processing Pipeline

## Pipeline Flow
- Resume Upload → stored in Object Storage (S3/Blob)
- Data Extraction → Serverless Functions
- AI Processing → Containerized ML services (Docker/Kubernetes)
- Ranking Results → stored in Database (NoSQL/SQL)
- API Layer → delivers results to frontend

---

# 4. Focus Areas Explanation

## Serverless vs Containers
- Serverless → event-based tasks (resume parsing)
- Containers → AI models (more control, GPU support)

## Batch vs Real-time
- Batch → screening thousands of resumes
- Real-time → interview scheduling, notifications

## Compute/GPU Optimization
- Use auto-scaling GPU instances
- Turn off idle GPUs (cost saving)

## Data Security
- Encrypt data (at rest + in transit)
- Use IAM roles & access control
- Store sensitive data in private cloud

---

# Final Architecture Summary
- Hybrid cloud setup
- PaaS for app + IaaS for AI
- Batch + real-time processing
- Serverless + containers mix
- Secure + scalable + cost-optimized

---

# 2. OTT Streaming Platform

## Cloud Model
- Public Cloud
- IaaS + PaaS + CDN

---

## Video Delivery System
- Upload → Object Storage
- Transcoding → Multiple qualities (HD/4K)
- Store → Distributed storage
- Deliver → CDN (nearest server to user)

---

## Global Scaling
- Use CDN worldwide
- Auto-scaling servers
- Load balancing
- Multi-region deployment

---

## Focus Points
- CDN → fast streaming, less buffering
- Distributed Storage → reliability
- Auto-scaling → handles traffic spikes
- Recommendation System → personalized content

---

## Conclusion
Scalable, low-latency system using CDN + cloud + auto-scaling + AI recommendations.