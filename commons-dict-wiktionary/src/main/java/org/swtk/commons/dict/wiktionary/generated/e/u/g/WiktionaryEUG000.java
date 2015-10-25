package org.swtk.commons.dict.wiktionary.generated.e.u.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryEUG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("euge", "{\"term\":\"euge\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin {{lena}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"applaus\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Henry Hammon\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"No such good news to heaven as this; not only approbation, but joy in heaven over one such convert prodigal: the music that Pythagoras talks of in the orbs, was that of the minstrels which our Saviour mentions at the return of that prodigal, to solemnize the \u0027\u0027\u0027euge\u0027\u0027\u0027s\u0026lt;!--SIC italics and apostrophe--\u0026gt;, the passionate welcomes of heaven poured out on penitents\", \"priority\":3}]}, \"synonyms\":{}}");

	add("eugenicism", "{\"term\":\"eugenicism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|eugenics|ism|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Support for the principles of eugenics\", \"priority\":1}]}, \"synonyms\":{}}");

	add("eugenics", "{\"term\":\"eugenics\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"Coined in 1883 by {{w|Francis Galton}}. From Ancient greek (to 1453) {{m|grc|ἐΰς||good}} and {{m|grc|γίγνομαι||breeding}}. Parallel to {{m|en|Eugene}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The science of improving stock, whether human or animal\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A social philosophy which advocates the improvement of human hereditary qualities through selective breeding\", \"priority\":2}]}, \"synonyms\":{}}");

	add("eugenist", "{\"term\":\"eugenist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|eugenic|ist|alt1\u003deugen(ic)|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An advocate or supporter of eugenics\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1999\u0027\u0027, \u0027Genome\u0027, Harper Perennial 2004, p. 293\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"When it reported in 1908, it took a strongly hereditarian view of mental deficiency, which was not surprising given that many of its members were paid-up \u0027\u0027eugenists\", \"priority\":3}]}, \"synonyms\":{}}");

	add("eugenocide", "{\"term\":\"eugenocide\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|eugenics|genocide|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The killing of weak or defective people in an attempt to improve the gene pool\", \"priority\":1}]}, \"synonyms\":{}}");

	add("euglycemia", "{\"term\":\"euglycemia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of having a normal concentration of glucose in the blood\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }