# Cómo contribuir

[![](https://openclipart.org/image/800px/svg_to_png/278845/git-flow.png)](https://openclipart.org/detail/278845/git-opensource-workflow)

1. Crea un fork del proyecto a tu cuenta de github.
2. Clona tu fork a tu entorno de desarrollo y añade un remoto llamado upstream con la dirección del repositorio original (`git remote add`).
3. En tu entorno local crea un branch descriptivo del feature o bugfix que quieres aportar. Un branch por cada cosa que quieras aportar.
4. Tira código como poseído, luego has push de tu branch a tu fork.
5. Crea un pull request a master describiendo lo que estás aportando.
6. Si tus cambios son aceptados o si hay cambios nuevos en `upstream` cambia a tu branch local `master` y has `git pull upstream master`.
7. Si tienes branches activos has `git checkout branch && git rebase master`, esto va a mantener tus branches siempre actualizadas.

## Sobre los nombres de los branch

Si es una característica nueva, que el nombre comience con `feature/` seguido de una breve descripción de la característica como `new-api-endpoint`. E.g. `feature/new-api-endpoint`.
Si es un bugfix, que el nombre comience con `bugfix/` seguido del bug que soluciona (puede ser como el título del issue asociado si es que existe. E.g. `bugfix/prevent-ddos`.

## Cerrar issues con commits

Si tu pull-request está asociado a un issue menciónalo en uno de los comits como `fix #123` o `close #123` para que al hacer merge se cierre el issue asociado.
