# ⚡ Compose Pokedex

A sleek, high-performance Pokedex application built to demonstrate modern Android development with **Jetpack Compose**. This app fetches data from the [PokéAPI](https://pokeapi.co/) to provide a rich database of Pokémon, their evolutions, and base stats.

## 📱 Features
* **Real-time Data:** Fetches live data from the PokéAPI.
* **Lazy Loading:** Efficient scrolling for 1000+ entries using `LazyColumn`.
* **Dynamic Theming:** UI colors adapt based on the Pokémon's primary type (e.g., Fire = Red, Grass = Green).
* **Detail Views:** Deep dive into stats, height, weight, and abilities.
* **Search:** Filter Pokémon by name or ID.

---

## 🛠 Tech Stack
* **UI:** [Jetpack Compose](https://developer.android.com/jetpack/compose) (100% Kotlin-based UI)
* **Networking:** [Retrofit](https://square.github.io/retrofit/) + [OkHttp](https://square.github.io/okhttp/)
* **Image Loading:** [Coil](https://coil-kt.github.io/coil/) (Compose-friendly image loader)
* **Dependency Injection:** [Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
* **Asynchronous Tasks:** Kotlin [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) & [Flow](https://kotlinlang.org/docs/flow.html)
* **Architecture:** MVVM (Model-View-ViewModel)

---

## 🚀 Getting Started

1. **Clone the repo:**
   ```bash
   git clone [https://github.com/YOUR_USERNAME/YOUR_REPO_NAME.git](https://github.com/YOUR_USERNAME/YOUR_REPO_NAME.git)
