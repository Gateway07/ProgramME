# 📄 Product Requirements Document (PRD)

## 🟢 Business Context

- **Problem:**
    1. Support team spend much time to answer tickets because documentation is sparse and very big.
    2. Project manager wants to reduce time to create requirements as user stories, issues for project tracking which are managed with Github issue tracker.
    3. Team leader wants to track completeness of requirements, productivity of each member.
    4. All discussions are happened in common Telegram chats (back-end team, web-map team, support team, routing team, common main chat)
    5. Full integration of all information flows between project's documentation, Github issues tracker, Telegram chats and code base:
       5.1. Project documentation is more stable and included proved information.
       5.2. Github issues tracker is more often updated by project manager and team leader.
       5.3. Telegram chats are very intensive place for discussions.
       5.4. Github code base includes code of all projects.
- **Opportunity:**
    1. Project manager would like to find all related discussions in Telegram chats per input requirement.
    2. Team leader can track completeness of requirements based on codebase.
    3. Also, Team leader can see feedback and monitor progress of corresponding requirements by using related discussions in Telegram chats.
    4. Project manager can track completeness of requirements and productivity of each member based on their code updates in Github codebase and related
       discussions in Telegram chats.
    5. Technical writer can make predicted documentation updates based on proved changes from codebase.
    6. Support team can answer tickets based on prepared Question & Answer (Q&A) index.
- **Primary KPI:**
    1. Reduce time to create requirements, issues for project tracking.
    2. Track completeness of requirements, productivity of each member based on their actual code updates in Github codebase.
    3. Reduce time and increase quality of ticket's answer because documentation is sparse and very big.
    4. Reduce time to update documentation based on predicted changes from Telegram and codebase.

## 🎯 High-level Goals

Create functional requirements based on business context which covers:
– Setup RAG process and make index of MD docs, Github codebase, Github issues for project tracking and Telegram chats.
– Save all information in Postgres database for semantic and full-text search for RAG purpose.

- Use LLM to generate appropriate semantic search index for RAG purpose.
  – Make requirement's prediction from codebase and Telegram chats discussion.
- Monitor productivity of each member based on their code impacts in Github codebase.
- Make predicted documentation updates based on codebase changes.
- Find all related discussions in Telegram chats per input requirement or documentation topic.
- Find all related code changes in Github codebase per input requirement or documentation topic.

