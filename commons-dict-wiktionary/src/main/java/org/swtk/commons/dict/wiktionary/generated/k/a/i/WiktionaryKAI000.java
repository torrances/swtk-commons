package org.swtk.commons.dict.wiktionary.generated.k.a.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKAI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kain", "{\"term\":\"kain\", \"etymology\":{\"influencers\":[], \"languages\":[\"Tagalog\"], \"text\":\"From Proto-malayo-polynesian {{m|poz-pro|*kaən}}, from Proto-austronesian {{m|map-pro|*kaən}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"kind; type\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kaiju", "{\"term\":\"kaiju\", \"etymology\":{\"influencers\":[], \"languages\":[\"mandarin chinese\", \"English\", \"Japanese\", \"late middle chinese\"], \"text\":\"From Japanese {{l|ja|怪獣|tr\u003dかいじゅう, kaijū}}, from Late middle chinese {{compound|lang\u003dltc|怪|獸|gloss1\u003dstrange, fantastic|gloss2\u003dbeast|tr1\u003dkwɛ̀j|tr2\u003dʃùw|nocat\u003d1}} (compare Mandarin chinese \u0027怪兽\u0027 .\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A giant monster, particularly such as those common to Japanese science fiction films, like Godzilla or Gamera. Short for 大怪獣 (\u0027giant kaiju\u0027).Category:English nouns with irregular pluralsCategory:English terms derived from JapaneseCategory:en:Japanese fiction\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kairomone", "{\"term\":\"kairomone\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027καιρός\u0027 (advantage) + \u0027pheromone\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any substance produced by an individual of one species that benefits the recipient which is of a different species but is harmful to the producer\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kaiser", "{\"term\":\"kaiser\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\"], \"text\":\"From German \u0027kaiser\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the w:German German Emperor, often specifically w:Wilhelm Wilhelm II\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kaizen", "{\"term\":\"kaizen\", \"etymology\":{\"influencers\":[], \"languages\":[\"mandarin chinese\", \"English\", \"Japanese\", \"late middle chinese\", \"old chinese\"], \"text\":\"From Japanese \u0027改善\u0027 (\u0027kaizen\u0027 かいぜん), from Late middle chinese 改善 (\u0027kój-dʒjén\u0027) (compare Mandarin chinese 改善|\u0027gǎishàn\u0027 改善), from Old chinese 改善 (\u0027*qˁəʔ-ɡenʔ\u0027 \u0026quot;to correct errors\u0026quot;), from 改 (\u0026quot;to change\u0026quot;) + 善 (\u0026quot;good\u0026quot;). Introduced to English in 1959, by [http://www.boyedemente.com/ Boyé Lafayette De Mente], in his book \u0027Japanese Etiquette and Ethics in Business.\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a Japanese business practice of continuous improvement in performance and productivit\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"continuous improvement in a general way\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }