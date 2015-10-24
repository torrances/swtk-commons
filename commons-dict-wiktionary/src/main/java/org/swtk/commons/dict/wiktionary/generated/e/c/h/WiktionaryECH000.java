package org.swtk.commons.dict.wiktionary.generated.e.c.h;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryECH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("echard", "{\"term\":\"echard\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ἔχω\u0027 (to hold) + \u0027ἄρδω\u0027 (to water, to irrigate)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The portion of water in a sample of soil that is not available to vegetatio\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1905\u0027\u0027, w:Arthur Arthur Tansley, \u0027[http://books.google.co.uk/books?id\u003d6J-TQh5fw7wC The New Phytologist]\u0027, page 238\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027echard\u0027\u0027 of a given habitat is experimentally ascertained by isolating a block of soil by impermeable plates, allowing it to dry slowly and determining its water-content at the time when the plants growing on it are wilting irrecoverabl\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1951\u0027\u0027, John Smith, \u0027[http://books.google.co.uk/books?id\u003dm4sQAQAAMAAJ Distribution of Tree Species in the Sudan in Relation to Rainfall and Soil Texture\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Grasses sprout on the sands long before the early rains have restored the \u0027\u0027echard\u0027\u0027 of adjoining clays and given a surplus as chresard which can initiate grass growth\", \"priority\":5}]}, \"synonyms\":{}}");

	add("echinacea", "{\"term\":\"echinacea\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From scientific Latin \u0027echinacea\u0027 from Ancient greek (to 1453) \u0027ἐχῖνος\u0027 (hedgehog) (because of the soft \u0026quot;spines\u0026quot; in the centre of the flower) {{suffix||acea|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several plants, of genus \u0027Echinacea\u0027, having pinkish-purple flowers\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A herbal medicine extracted from the roots and seeds of such plants\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"passage\u003dAthletes\u0027 use of herbal supplements has skyrocketed in the past two decades. At the top of the list of popular herbs are \u0027\u0027echinacea\u0027\u0027 and ginseng, whereas garlic, St. John\u0027s wort, soybean, ephedra and others are also surging in popularity or have been historically prevalent\", \"priority\":3}]}, \"synonyms\":{}}");

	add("echocardiography", "{\"term\":\"echocardiography\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|echo|cardiography|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The use of ultrasound to produce images of the heart\", \"priority\":1}]}, \"synonyms\":{}}");

	add("echoer", "{\"term\":\"echoer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|echo|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who, or that which, echoes or repeats something back\", \"priority\":1}]}, \"synonyms\":{}}");

	add("echokinesis", "{\"term\":\"echokinesis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|echo|kinesis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the compulsion or the act of imitating movements of others\", \"priority\":1}]}, \"synonyms\":{}}");

	add("echolalia", "{\"term\":\"echolalia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|echo|lalia|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The immediate, involuntary, and repetitive echoing of words or phrases spoken by another\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An infant\u0027s repetitive imitation of vocal sounds spoken by another person, occurring naturally during childhood development\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Any apparently meaningless, repetitious noises, especially voices\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1926\u0027\u0027, \u0027The Great Gatsby\u0027, Penguin 2000, p. 50\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"There was the boom of a bass drum, and the voice of the orchestra leader rang out suddenly above the \u0027\u0027echolalia\u0027\u0027 of the garden\", \"priority\":5}]}, \"synonyms\":{}}");

	add("echometer", "{\"term\":\"echometer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|echo|meter|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A graduated scale for measuring the duration of sounds and determining the relation of their intervals\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }