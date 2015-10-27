package org.swtk.commons.dict.wordnet.index.name.instance.s.p.h.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSPHA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sphacele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12872433\"]}");
	add("{\"term\":\"sphacelotheca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13088292\"]}");
	add("{\"term\":\"sphacelus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11507108\", \"14336867\"]}");
	add("{\"term\":\"sphaeralcea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12207967\"]}");
	add("{\"term\":\"sphaeriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12984890\"]}");
	add("{\"term\":\"sphaeriales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12984556\"]}");
	add("{\"term\":\"sphaerobolaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13067771\"]}");
	add("{\"term\":\"sphaerocarpaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11564765\"]}");
	add("{\"term\":\"sphaerocarpales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11564582\"]}");
	add("{\"term\":\"sphaerocarpos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11564991\"]}");
	add("{\"term\":\"sphaerocarpus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11564991\"]}");
	add("{\"term\":\"sphagnales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11562164\"]}");
	add("{\"term\":\"sphagnum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11562588\"]}");
	add("{\"term\":\"sphalerite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15132443\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }