package org.swtk.commons.dict.wiktionary.generated.a.b.n;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryABN000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("abner", "{\"term\":\"abner\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Hebrew \u0027אבנר|tr\u003dabner\u0027 (father of light) From \u0027אָב|tr\u003dav\u0027 (father) + \u0027נור|tr\u003dnur\u0027 (light)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A cousin of Saul mentioned in the Old Testament\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"And when Saul saw David go forth against the Philistine, he said unto \u0027\u0027Abner\u0027\u0027, the captain of the host,\u0027\u0027 Abner\u0027\u0027, whose son is this youth? And \u0027\u0027Abner\u0027\u0027 said, As thy soul liveth, O king, I cannot tell\", \"priority\":2}]}, \"synonyms\":{}}");

	add("abnet", "{\"term\":\"abnet\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Hebrew\"], \"text\":\"From Hebrew \u0027avnet\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The girdle of a Jewish priest or officer. \u0026lt;ref\u0026gt;\u0026lt;/ref\u0026gt\", \"priority\":1}]}, \"synonyms\":{}}");

	add("abnegator", "{\"term\":\"abnegator\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From from Latin \u0027abnegatus\u0027 Equivalent to {{suffix|abnegate|or|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who abnegates, denies, or rejects. \u0026lt;ref\u0026gt;\u0026lt;/ref\u0026gt\", \"priority\":1}]}, \"synonyms\":{}}");

	add("abnormalcy", "{\"term\":\"abnormalcy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|abnormal|cy|lang\u003den}}, by analogy with normalcy.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Capitalism was not a normalcy but an abnormalcy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("abnormality", "{\"term\":\"abnormality\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|abnormal|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being abnormal; variation; irregularity. \u0026lt;ref name\u003dSOED\u0026gt;\u0026lt;/ref\u0026gt\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Something abnormal; an aberration; an abnormal occurrence or feature. \u0026lt;ref name\u003dSOED/\u0026gt\", \"priority\":2}]}, \"synonyms\":{}}");

	add("abnormalness", "{\"term\":\"abnormalness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|abnormal|ness|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being abnormal. \u0026lt;ref name\u003dSOED\u0026gt;\u0026lt;/ref\u0026gt\", \"priority\":1}]}, \"synonyms\":{}}");

	add("abnormity", "{\"term\":\"abnormity\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From \u0027lang\u003dla\u0027 from Latin \u0027abnormis\u0027 (irregular, abnormal) from \u0027ab\u0027 + \u0027norm\u0027 (rule, pattern) See also \u0027abnormous\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"lt;ref name\u003dSOED\u0026gt;\u0026lt;/ref\u0026gt\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1893\u0027\u0027, Adeline Dutton Train Whitney, \u0027[http://www.gutenberg.org/etext/13997 Real Folks\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Why do critics—some of them—make such short, smart work,—such cheerful, confident despatch, nowadays, of a story with religion in it, as if it were an \u0027\u0027abnormity\u0027\u0027,—a thing with sentence of death in itself, like a calf born with two heads,—that needs not their trouble, save to name it as it is\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A monstrosity \u0026lt;ref name\u003dSOED/\u0026gt\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }