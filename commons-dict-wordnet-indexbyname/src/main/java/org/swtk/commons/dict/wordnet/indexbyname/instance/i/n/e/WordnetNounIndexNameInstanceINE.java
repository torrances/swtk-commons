package org.swtk.commons.dict.wordnet.indexbyname.instance.i.n.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceINE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"inebriant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07900542\"]}");
	add("{\"term\":\"inebriate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10057110\"]}");
	add("{\"term\":\"inebriation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14042038\", \"14088126\"]}");
	add("{\"term\":\"inebriety\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14042038\"]}");
	add("{\"term\":\"ineffectiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05215231\"]}");
	add("{\"term\":\"ineffectuality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05215231\"]}");
	add("{\"term\":\"ineffectualness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05215231\"]}");
	add("{\"term\":\"inefficaciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05215559\"]}");
	add("{\"term\":\"inefficacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05215559\"]}");
	add("{\"term\":\"inefficiency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05656798\"]}");
	add("{\"term\":\"inelasticity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05030399\"]}");
	add("{\"term\":\"inelegance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04822552\"]}");
	add("{\"term\":\"ineligibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04725410\"]}");
	add("{\"term\":\"ineluctability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04761184\"]}");
	add("{\"term\":\"ineptitude\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05146826\", \"05656304\"]}");
	add("{\"term\":\"ineptness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04728334\", \"05656304\"]}");
	add("{\"term\":\"inequality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04759476\"]}");
	add("{\"term\":\"inequity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04846907\"]}");
	add("{\"term\":\"inerrancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04812532\"]}");
	add("{\"term\":\"inert gas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14648547\"]}");
	add("{\"term\":\"inertia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11489163\", \"04642988\"]}");
	add("{\"term\":\"inertial frame\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06019932\"]}");
	add("{\"term\":\"inertial guidance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00818502\"]}");
	add("{\"term\":\"inertial guidance system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03574473\"]}");
	add("{\"term\":\"inertial mass\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05032859\"]}");
	add("{\"term\":\"inertial navigation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00818502\"]}");
	add("{\"term\":\"inertial navigation system\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03574473\"]}");
	add("{\"term\":\"inertial reference frame\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06019932\"]}");
	add("{\"term\":\"inertness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04783811\"]}");
	add("{\"term\":\"inessential\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09335551\"]}");
	add("{\"term\":\"inessentiality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05180342\"]}");
	add("{\"term\":\"inevitability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04761311\"]}");
	add("{\"term\":\"inevitable\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07344850\"]}");
	add("{\"term\":\"inevitable accident\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07329950\"]}");
	add("{\"term\":\"inevitableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04761311\"]}");
	add("{\"term\":\"inexactitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04811860\"]}");
	add("{\"term\":\"inexactness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04811860\"]}");
	add("{\"term\":\"inexorability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04838668\"]}");
	add("{\"term\":\"inexorableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04838668\"]}");
	add("{\"term\":\"inexpedience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05172830\"]}");
	add("{\"term\":\"inexpediency\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05172830\"]}");
	add("{\"term\":\"inexpensiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05153986\"]}");
	add("{\"term\":\"inexperience\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05997841\"]}");
	add("{\"term\":\"inexperienced person\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09644529\"]}");
	add("{\"term\":\"inexplicitness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04832050\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }