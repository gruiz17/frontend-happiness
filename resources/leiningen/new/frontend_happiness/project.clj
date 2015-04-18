(defproject {{name}} "0.0.1"
  :description "description for your project"
  :url "http://example.com/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3126"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [reagent "0.5.0"]
                 [reagent-forms "0.5.0"]
                 [reagent-utils "0.1.4"]
                 [figwheel "0.2.5"]
                 [secretary "1.2.3"]
                 [cljs-http "0.1.30"]]
  
  :plugins [[lein-cljsbuild "1.0.4"]
            [lein-figwheel "0.2.5"]]
  
  :figwheel {:http-server-root "public"
             :server-port 3449
             :repl true}
  
  :cljsbuild {:builds
              [{:id "dev"
               	:source-paths ["src/{{sanitized}}/main" "src/{{sanitized}}/figwheel"]
                :compiler {:output-to "resources/public/main.js"
                           :output-dir "resources/public/out"
                           :optimizations :none
                           :source-maps true
                           :pretty-print true}}
               
               {:id "prod"
                :source-paths ["src/{{sanitized}}/main"]
                :compiler {:output-to "resources/public/main.js"
                           :output-dir "resources/public/out_prod"
                           :optimizations :advanced
                           :pretty-print false}}]})
