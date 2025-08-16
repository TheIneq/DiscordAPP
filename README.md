[![JDA](https://img.shields.io/badge/JDA-5.6.1-purple)](https://github.com/discord-jda/JDA)
![Java](https://img.shields.io/badge/Java-24+-white)
![Gradle](https://img.shields.io/badge/Gradle-8+-blue)
![License](https://img.shields.io/badge/license-MIT-green)

# Discord APP Template

This is a template project for building a Discord APP using [JDA](https://github.com/DV8FromTheWorld/JDA) (Java Discord API).  
The APP token is securely loaded from a `.env` file using the [dotenv-java](https://github.com/cdimascio/dotenv-java) library.

## Requirements

- **Java 24 or higher**
- **Gradle 8+**
- **A registered APP token from the** [Discord Developer Portal](https://discord.com/developers/applications)

## Getting Started

**1. Clone the repository:**

```
git clone https://github.com/TheIneq/DiscordAPPTemplate.git
```

**2. Insert your bot token into the `.env` file:**

There is already a `.env` file in the root of the project. Open it and paste your APP token like this:

```
TOKEN=YOUR_TOKEN_HERE
```

**3. Run APP**

Use your IDE or run via Gradle:

```
./gradlew run
```
