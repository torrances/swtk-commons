package org.swtk.commons.dict.wordnet.indexbyname.instance.e.x.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEXA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"exabit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13652655\"]}");
	add("{\"term\":\"exabyte\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13652325\", \"13652498\"]}");
	add("{\"term\":\"exacerbation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01224646\", \"00375643\"]}");
	add("{\"term\":\"exacta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00508036\"]}");
	add("{\"term\":\"exaction\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01063450\"]}");
	add("{\"term\":\"exactitude\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04810679\"]}");
	add("{\"term\":\"exactness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04810679\"]}");
	add("{\"term\":\"exacum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12312802\"]}");
	add("{\"term\":\"exaeretodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01723508\"]}");
	add("{\"term\":\"exaggeration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06771546\", \"00368378\", \"07121187\"]}");
	add("{\"term\":\"exaltation\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01031146\", \"08008436\", \"08702757\", \"14009857\"]}");
	add("{\"term\":\"exam\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07211681\"]}");
	add("{\"term\":\"examen\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05742233\", \"05795010\"]}");
	add("{\"term\":\"examination\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00637704\", \"05795010\", \"07208618\", \"07211681\", \"00637093\"]}");
	add("{\"term\":\"examinee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10723341\"]}");
	add("{\"term\":\"examiner\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10087775\", \"10088041\"]}");
	add("{\"term\":\"example\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00731217\", \"07323507\", \"06685497\", \"05933998\", \"05945830\", \"05828980\"]}");
	add("{\"term\":\"exanthem\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14345241\"]}");
	add("{\"term\":\"exanthema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14345241\"]}");
	add("{\"term\":\"exarch\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10088232\", \"10088344\", \"10088489\"]}");
	add("{\"term\":\"exarchate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08568871\"]}");
	add("{\"term\":\"exasperation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00426454\", \"07534117\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }