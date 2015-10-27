package org.swtk.commons.dict.wordnet.index.name.instance.r.e.s.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRESE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"research\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05805605\", \"00638164\"]}");
	add("{\"term\":\"researcher\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10542669\"]}");
	add("{\"term\":\"reseau\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04085114\", \"04085262\"]}");
	add("{\"term\":\"resection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00692303\"]}");
	add("{\"term\":\"reseda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12405946\"]}");
	add("{\"term\":\"resedaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12405563\"]}");
	add("{\"term\":\"resemblance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04754685\"]}");
	add("{\"term\":\"resentment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07564444\"]}");
	add("{\"term\":\"reserpine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04085348\"]}");
	add("{\"term\":\"reservation\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00821752\", \"05803468\", \"07192432\", \"01220817\", \"05706585\", \"06775091\", \"08604729\"]}");
	add("{\"term\":\"reserve\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"04659795\", \"08223381\", \"08604729\", \"13781913\", \"10690481\", \"13389225\", \"04907298\"]}");
	add("{\"term\":\"reserves\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08407468\"]}");
	add("{\"term\":\"reservist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10542934\"]}");
	add("{\"term\":\"reservoir\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09430745\", \"04085686\", \"04085859\", \"13799066\"]}");
	add("{\"term\":\"reset\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04086067\"]}");
	add("{\"term\":\"resettlement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01255153\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }