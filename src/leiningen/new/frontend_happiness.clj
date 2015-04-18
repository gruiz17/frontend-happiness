(ns leiningen.new.frontend-happiness
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "frontend-happiness"))

(defn frontend-happiness
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' frontend-happiness project.")
    (->files data ["project.clj" (render "project.clj" data)]
              ["resources/public/index.html" (render "resources/public/index.html" data)]
              ["resources/public/stylesheets/main.css" (render "resources/public/stylesheets/main.css" data)]
              ["src/{{sanitized}}/main/core.cljs" (render "src/frontend_happiness/main/core.cljs" data)]
              ["src/{{sanitized}}/figwheel/main_figwheel.cljs" (render "src/frontend_happiness/main/main_figwheel.cljs" data)]
              ["LICENSE" (render "LICENSE" data)]
              ["README.md" (render "README.md" data)]
              [".gitignore" (render ".gitignore" data)]
              ["bower.json" (render "bower.json" data)]
              [".bowerrc" (render ".bowerrc" data)]
              )))
