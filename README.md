# 🎵 SoundSnippets API

A simple Java + Spring Boot CRUD API for managing user-submitted sound snippet metadata, designed to demonstrate backend development skills with RESTful services, JPA, and PostgreSQL.

##  Features

- Full CRUD API for sound snippets
- RESTful endpoints built with Spring Web
- Persistent storage with PostgreSQL
- Clean JPA-based data layer using Spring Data
- Auto-generated UUIDs for entity IDs
- Built using Java 17 + Spring Boot 3
- Lightweight and containerizable

##  Tech Stack

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- PostgreSQL (or H2)
- Lombok
- Maven

##  Entity Schema

### `SoundSnippet`

| Field         | Type     | Description                       |
|---------------|----------|-----------------------------------|
| `id`          | UUID     | Auto-generated unique ID          |
| `name`        | String   | Name of the sound snippet         |
| `description` | String   | Brief description                 |
| `category`    | String   | e.g., ambient, beats, vocals      |
| `url`         | String   | URL to the audio file             |

##  API Endpoints

| Method | Endpoint           | Description                |
|--------|--------------------|----------------------------|
| GET    | `/snippets`        | Get all sound snippets     |
| GET    | `/snippets/{id}`   | Get a snippet by ID        |
| POST   | `/snippets`        | Create a new snippet       |
| PUT    | `/snippets/{id}`   | Update a snippet by ID     |
| DELETE | `/snippets/{id}`   | Delete a snippet by ID     |

## 🛠️ Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/jadend-r/soundsnippets-rest-api.git
cd soundsnippets-rest-api
