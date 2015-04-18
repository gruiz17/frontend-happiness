# frontend-happiness

[![Clojars Project](http://clojars.org/frontend-happiness/lein-template/latest-version.svg)](http://clojars.org/frontend-happiness/lein-template)

Extremely minimal template for ClojureScript projects. ClojureScript libraries/tools included:

* [Figwheel](https://github.com/bhauman/lein-figwheel)
* [Reagent](https://github.com/reagent-project/reagent)
* [Secretary](https://github.com/gf3/secretary)
* [cljs-http](https://github.com/r0man/cljs-http)
* [core.async](https://github.com/clojure/core.async)

Non-ClojureScript tools included:

* [Bower](http://bower.io/)
* [Bootstrap](http://getbootstrap.com/) (and because of dependency [jQuery](https://jquery.com/))

## Installation

### Using Git/GitHub locally with leiningen

1. `git clone https://github.com/gruiz17/frontend-happiness`
2. `cd frontend-happiness`
3. `lein install`

### Using Clojars/your profiles.cljs file

1. Open up your `~/.lein/profiles.clj` file.
2. Add the needed plugins: `{:user {:plugins [[frontend-happiness "0.0.1"]]}}

## Usage

1. `lein new frontend-happiness {{appname}}`
2. then `cd` into `{{appname}}` and run `bower install`
3. then just start `lein figwheel` and visit `localhost:3449`

## Todo

* add more instructions for releasing to gh-pages

## License

Copyright © 2015 Gabriel Ruiz

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
