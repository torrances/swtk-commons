package org.swtk.commons.dict.wiktionary.generated.k.a.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKAR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("karaite", "{\"term\":\"karaite\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Hebrew\"], \"text\":\"\u0027Karaism\u0027 (from Hebrew + \u0027-ite\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An adherent of Karaism\", \"priority\":1}]}, \"synonyms\":{}}");

	add("karakter", "{\"term\":\"karakter\", \"etymology\":{\"influencers\":[], \"languages\":[\"Afrikaans\", \"Dutch\"], \"text\":\"From Dutch \u0027karakter\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"character, natur\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a character (\u0027in a novel etc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"mark (in an exam, schoolwork\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"gode \u0027\u0027karakterer\u0027\u0027 - good marks\", \"priority\":4}]}, \"synonyms\":{}}");

	add("karateist", "{\"term\":\"karateist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|karate|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who does karate\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kartvelian", "{\"term\":\"kartvelian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|ka|ქართველი|lang\u003den}}{{suffix||ian|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a member of a group of related peoples in the South Caucasus, namely Georgians, Svans, Mingrelians and Laz\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a Georgian person, from the endonym\", \"priority\":2}]}, \"synonyms\":{}}");

	add("karyoclasis", "{\"term\":\"karyoclasis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|karyo|clasis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the disintegration of a cell\u0027s nucleus\", \"priority\":1}]}, \"synonyms\":{}}");

	add("karyogamy", "{\"term\":\"karyogamy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|karyo|gamy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The fusion of two nuclei within a cell, especially as the second stage of syngamy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("karyology", "{\"term\":\"karyology\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The study of the nuclei of cells, especially with regard to the chromosomes which they contain\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The characteristics of a particular cellular nucleus or group of nuclei, or of the chromosomes therein\", \"priority\":2}]}, \"synonyms\":{}}");

	add("karyolysis", "{\"term\":\"karyolysis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|karyo|lysis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The dissolution of the nucleus of a cell by the action of deoxyribonuclease\", \"priority\":1}]}, \"synonyms\":{}}");

	add("karyomegaly", "{\"term\":\"karyomegaly\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|karyo|megaly|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of having an enlarged cell nucleus\", \"priority\":1}]}, \"synonyms\":{}}");

	add("karyomere", "{\"term\":\"karyomere\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{confix|karyo|mere|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A saclike vesicle containing a small portion of the nuclear material after atypical mitosis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("karyomorph", "{\"term\":\"karyomorph\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|karyo|morph|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A form of individual having a specific karyotype\", \"priority\":1}]}, \"synonyms\":{}}");

	add("karyorrhexis", "{\"term\":\"karyorrhexis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|karyo|rhexis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The destructive fragmentation of the nucleus of a dying cell whereby its chromatin is distributed irregularly throughout the cytoplasm\", \"priority\":1}]}, \"synonyms\":{}}");

	add("karyotype", "{\"term\":\"karyotype\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Russian\"], \"text\":\"From Russian \u0027кариотип\u0027 corresponding to \u0027\u0027 + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The observed characteristics (number, type, shape, etc) of the chromosomes of an individual or species\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A record of such characteristics, usually photographic\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A group of individuals or species that have the same chromosomal characteristics\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }