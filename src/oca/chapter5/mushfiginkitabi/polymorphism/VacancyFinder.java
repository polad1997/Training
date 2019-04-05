package oca.chapter5.mushfiginkitabi.polymorphism;

import java.util.Arrays;
import java.util.List;

public class VacancyFinder {
    public static void main(String[] args) {
        List<Vacancy> listWebSite = Arrays.asList(new JobSearchAz(), new BossAz(), new RabotaAz());
        listWebSite.forEach(v -> display(v));
    }

    private static void display(Vacancy vacancy) {
        vacancy.getVacancies();
    }
}
