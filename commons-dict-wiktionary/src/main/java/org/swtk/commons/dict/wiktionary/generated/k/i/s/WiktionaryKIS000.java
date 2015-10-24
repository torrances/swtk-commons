package org.swtk.commons.dict.wiktionary.generated.k.i.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKIS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kishke", "{\"term\":\"kishke\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Polish\", \"Russian\", \"Ukrainian\", \"Yiddish\"], \"text\":\"Attested in English since the late 1930s, from Yiddish \u0027קישקע\u0027 from Polish \u0027kiszka\u0027 Russian \u0027кишка́\u0027 or Ukrainian \u0027ки́шка\u0027 Ultimately from Proto-Slavic {{m|sla-pro|*kyša}}, {{m|sla-pro|*kyšьka||intestine, stomach}}. Related to Sanskrit \u0027कोष्ठ|tr\u003dkoṣṭha\u0027 (intestine) and possibly Ancient Greek \u0027κύστις\u0027 (bladder)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dish made from stuffed intestine\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Intestines, guts\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1969\u0027\u0027, Philip Roth, \u0027Portnoy\u0027s Complaint\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Subsequently she was over the toilet all night throwing up. ‘My \u0027\u0027\u0027kishkas\u0027\u0027\u0027 came out from that thing! Some practical joker\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Oy a broch! I was so worried! I knew something was wrong. In my \u0027\u0027kishkes\u0027\u0027, I could feel it\", \"priority\":5}]}, \"synonyms\":{}}");

	add("kissee", "{\"term\":\"kissee\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|kiss|ee|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who is kissed\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kisser", "{\"term\":\"kisser\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"agent Agent noun of kiss; one who kisses\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"She\u0027s a great \u0027\u0027kisser\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Mouth\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1918\u0027\u0027, Ralph Selwood Kendall, \u0027Benton of the Royal Mounted\u0027, Grosset \u0026amp; Dunlap, New York, p. 121\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Get yore handkerchief ready, an\u0027 run out an\u0027 cram it into his \u0027\u0027kisser\u0027\u0027 an\u0027 choke th\u0027 —— if he starts in to holler\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1999\u0027\u0027, Karen Shenfeld, \u0026quot;Fanny Brice 1891-1951,\u0026quot; in \u0027The Law of Return\u0027, Guernica, ISBN 1550710923, p. 18\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Not a pretty \u0027\u0027kisser\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"but so mobile thos\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"drawn-on brows, bulgin\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"peepers green as dill\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"cock-eyed grin\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"the It Girls lost i\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"beside her\", \"priority\":13},{\"upperType\":\"NOUN\", \"text\":\"The kissing gourami\", \"priority\":14},{\"upperType\":\"NOUN\", \"text\":\"A button that indicates consistent vertical distance when drawing a bow\", \"priority\":15}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }