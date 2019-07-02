BTI-7055 Examination Skeleton
> This project provides a fully featured JavaFX project skeleton packaged via Maven.

*Please read the [Usage for BTI-7055 Examination](#usage-for-bti-7055-examination) before using this project!*

# Run / Debug Application

Application's entry point is `io.github.bbortt.oop2.examination.Application`. The Project contains an Eclipse run configuration which will be imported into the IDE automatically. You can execute and debug your code just as any other java application.

# Create Executable .jar

The following command generates an executable .jar file in the `./target` folder.

```bash
mvn clean package
```

# License

This project is licensed under the terms of the [MIT License](https://github.com/bbortt/bti-7055-oop-2-examination/blob/master/LICENSE).

## Usage for BTI-7055 Examination

You may use this project as a skeleton (e.g. starting point) for your own examination project. However users are advised to change any occurrences of `io.github.bbortt` in all files. For your own safety you should change the artifact name (`<artifactId>oop2-examination</artifactId>` in `pom.xml`) and the package names to something meaningful for you.
Last but not least: Delete this `README.md` as well, it points straight towards the source repository ;)

In any claim of copyright violation [bbortt](https://github.com/bbortt) is the only legitimate user of this code.
