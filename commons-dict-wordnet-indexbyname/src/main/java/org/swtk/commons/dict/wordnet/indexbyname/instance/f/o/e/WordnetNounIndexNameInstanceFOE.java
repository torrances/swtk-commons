package org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFOE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"foe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10118479\", \"10075655\"]}");
	add("{\"term\":\"foehn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11462726\"]}");
	add("{\"term\":\"foeman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10075655\"]}");
	add("{\"term\":\"foeniculum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12959657\"]}");
	add("{\"term\":\"foetology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06063385\"]}");
	add("{\"term\":\"foetometry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01004226\"]}");
	add("{\"term\":\"foetoprotein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15058229\"]}");
	add("{\"term\":\"foetor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05722841\"]}");
	add("{\"term\":\"foetoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03335737\"]}");
	add("{\"term\":\"foetoscopy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00946272\"]}");
	add("{\"term\":\"foetus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01462432\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }