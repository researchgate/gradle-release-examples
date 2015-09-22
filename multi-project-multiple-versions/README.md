# multi-project-multiple-versions example

This is a simple example on how a multi project could look like and how the gradle-release plugin is configured.
In this example we use separate versions for each (sub)project.

## Usage

Fork the repository and checkout locally.

Then you can test executing the release by

```
$ cd multi-project-single-version
$ ./gradlew release
```

On windows you would do

```
$ cd multi-project-single-version
$ gradlew.bat release
```

Only releasing the parent/root-project

```
$ ./gradlew :release
```

Only releasing one sub-project

```
$ ./gradlew :subproject1:release
```

## Contributing

If you have an idea which feature of the gradle-release plugin we could show here,
you are welcome to submit a pull request.