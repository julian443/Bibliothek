package ch.aprentas.applikationslogik;

import ch.aprentas.dto.KundeDTO;
import ch.aprentas.dto.MediumDTO;

public class Umwandler {

    public Kunde convertKundeDtoToKunde(KundeDTO kundeDto) {
        Kunde kunde = new Kunde();

        kunde.setEmail(kundeDto.getEmail());
        kunde.setGeburtsjahr(kundeDto.getGeburtsjahr());
        kunde.setKundenNummer(kundeDto.getKundenNummer());
        kunde.setName(kundeDto.getName());
        kunde.setVorname(kundeDto.getVorname());
        kunde.setOrt(kundeDto.getOrt());
        kunde.setPlz(kundeDto.getPlz());
        kunde.setStrasse(kundeDto.getStrasse());
        kunde.setStrassenNummer(kundeDto.getStrassenNummer());

        return kunde;
    }

    public KundeDTO convertKundeToDto(Kunde kunde) {
        KundeDTO kundeDto = new KundeDTO();

        kundeDto.setEmail(kunde.getEmail());
        kundeDto.setGeburtsjahr(kunde.getGeburtsjahr());
        kundeDto.setKundenNummer(kunde.getKundenNummer());
        kundeDto.setName(kunde.getName());
        kundeDto.setVorname(kunde.getVorname());
        kundeDto.setOrt(kunde.getOrt());
        kundeDto.setPlz(kunde.getPlz());
        kundeDto.setStrasse(kunde.getStrasse());
        kundeDto.setStrassenNummer(kunde.getStrassenNummer());

        return kundeDto;
    }

}
