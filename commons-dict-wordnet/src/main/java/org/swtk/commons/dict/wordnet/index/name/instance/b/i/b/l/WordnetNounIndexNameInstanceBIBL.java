package org.swtk.commons.dict.wordnet.index.name.instance.b.i.b.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBIBL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bible\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06434286\", \"06443410\"]}");
	add("{\"term\":\"bibliographer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09871966\"]}");
	add("{\"term\":\"bibliography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06498467\"]}");
	add("{\"term\":\"bibliolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01046791\"]}");
	add("{\"term\":\"bibliomania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04953443\"]}");
	add("{\"term\":\"bibliophile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09872087\"]}");
	add("{\"term\":\"bibliopole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09872234\"]}");
	add("{\"term\":\"bibliopolist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09872234\"]}");
	add("{\"term\":\"bibliothec\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10277645\"]}");
	add("{\"term\":\"bibliotheca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07994478\"]}");
	add("{\"term\":\"bibliotics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06007704\"]}");
	add("{\"term\":\"bibliotist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09872387\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }