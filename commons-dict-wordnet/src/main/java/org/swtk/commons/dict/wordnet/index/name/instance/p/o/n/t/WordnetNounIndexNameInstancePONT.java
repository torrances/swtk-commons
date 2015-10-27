package org.swtk.commons.dict.wordnet.index.name.instance.p.o.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePONT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pontederia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12630603\"]}");
	add("{\"term\":\"pontederiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12630399\"]}");
	add("{\"term\":\"pontiac\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11262586\"]}");
	add("{\"term\":\"pontifex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10472448\"]}");
	add("{\"term\":\"pontiff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10473089\"]}");
	add("{\"term\":\"pontifical\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03987698\"]}");
	add("{\"term\":\"pontificate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08070012\"]}");
	add("{\"term\":\"pontoon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03987822\", \"03987924\"]}");
	add("{\"term\":\"pontos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09591905\"]}");
	add("{\"term\":\"pontus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08719533\", \"09591905\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }