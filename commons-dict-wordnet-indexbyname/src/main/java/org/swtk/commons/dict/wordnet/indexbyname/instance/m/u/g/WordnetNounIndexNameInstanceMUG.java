package org.swtk.commons.dict.wordnet.indexbyname.instance.m.u.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mug\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03802912\", \"05609112\", \"09940867\", \"13790580\"]}");
	add("{\"term\":\"mug book\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06523387\"]}");
	add("{\"term\":\"mug file\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06523387\"]}");
	add("{\"term\":\"mug shot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03803070\"]}");
	add("{\"term\":\"mugful\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13790580\"]}");
	add("{\"term\":\"muggee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10356847\"]}");
	add("{\"term\":\"mugger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10357013\"]}");
	add("{\"term\":\"mugginess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14559409\"]}");
	add("{\"term\":\"mugging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00775506\"]}");
	add("{\"term\":\"muggins\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10120530\"]}");
	add("{\"term\":\"mugho pine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11632800\"]}");
	add("{\"term\":\"mugil\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02604219\"]}");
	add("{\"term\":\"mugil cephalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02604397\"]}");
	add("{\"term\":\"mugil curema\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02604551\"]}");
	add("{\"term\":\"mugil liza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02604689\"]}");
	add("{\"term\":\"mugilidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02603830\"]}");
	add("{\"term\":\"mugiloidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02603583\"]}");
	add("{\"term\":\"mugo pine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11632800\"]}");
	add("{\"term\":\"mugshot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03803070\"]}");
	add("{\"term\":\"mugwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11949327\"]}");
	add("{\"term\":\"mugwump\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10357201\", \"10357358\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }