package com.simplon.miniLearningTracker.config;

import javax.swing.Spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Cette annotation @Configuration indique à Spring que cette classe contient de la configuration.
// Au démarrage de l'application, Spring va charger cette classe et appliquer les paramètres définis à l'intérieur.
@Configuration
// WebMvcConfigurer est une interface de Spring qui permet de personnaliser le comportement de Spring MVC sans remplacer sa configuration par défaut.
// On peut notamment :
// configurer les CORS
// ajouter des interceptors
// configurer les ressources statiques
// définir des convertisseurs

public class WebMvcConfig implements WebMvcConfigurer {
// Permet de gérer les cors
// Sert à autoriser les requêtes provenant d'un autre domaine (CORS).
    @Override
// addCorsMappings
// Cette méthode est appelée automatiquement par Spring au démarrage.
// Elle permet de définir quelles origines sont autorisées à accéder à l'API.
    public void addCorsMappings(CorsRegistry registry) {
// Le pattern /** signifie :
// "Toutes les routes de mon API"
// Exemple :
// GET /users
// POST /users
// GET /products
// DELETE /orders/10
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173");
    }
}
