# Cómo contribuir

[![](https://openclipart.org/image/800px/svg_to_png/278845/git-flow.png)](https://openclipart.org/detail/278845/git-opensource-workflow)

* Crea un fork del proyecto y clónalo. Añade el repositorio original como un remoto de nombre upstream (`git remote add upstream git@github.com:XalapaJS/backback.git`)
* En tu entorno local crea un branch descriptivo del feature o bugfix que quieres aportar. Un branch por cada cosa que quieras aportar.
* Has push de tu branch a `origin` (`git push -u origin branch`) y crea un pull request a master describiendo lo que estás aportando.
* Si tus cambios son aceptados o si hay cambios nuevos en `upstream` has `git pull upstream master`. Si tienes branches activos has `git checkout branch && git rebase master`

## Sobre los nombres de los branch

Si es una característica nueva, que el nombre comience con `feature/` seguido de una breve descripción de la característica como `new-api-endpoint`. E.g. `feature/new-api-endpoint`.
Si es un bugfix, que el nombre comience con `bugfix/` seguido del bug que soluciona (puede ser como el título del issue asociado si es que existe. E.g. `bugfix/prevent-ddos`.

## Cerrar issues con commits

Si tu pull-request está asociado a un issue menciónalo en uno de los comits como `fix #123` o `close #123` para que al hacer merge se cierre el issue asociado.
