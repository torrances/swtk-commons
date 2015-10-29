package org.swtk.commons.dict.wordnet.indexbyname.instance.i.l.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceILE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ileal artery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05354262\"]}");
	add("{\"term\":\"ileitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14371100\"]}");
	add("{\"term\":\"ileocecal valve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05544271\"]}");
	add("{\"term\":\"ileocolic artery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05354440\"]}");
	add("{\"term\":\"ileocolic vein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05376909\"]}");
	add("{\"term\":\"ileostomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00682324\"]}");
	add("{\"term\":\"iles comores\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08751523\"]}");
	add("{\"term\":\"iles marquises\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09013369\"]}");
	add("{\"term\":\"ileum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05543000\"]}");
	add("{\"term\":\"ileus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14531751\"]}");
	add("{\"term\":\"ilex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12777622\"]}");
	add("{\"term\":\"ilex cornuta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12777875\"]}");
	add("{\"term\":\"ilex decidua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12778063\"]}");
	add("{\"term\":\"ilex glabra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12778218\"]}");
	add("{\"term\":\"ilex paraguariensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12778428\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }