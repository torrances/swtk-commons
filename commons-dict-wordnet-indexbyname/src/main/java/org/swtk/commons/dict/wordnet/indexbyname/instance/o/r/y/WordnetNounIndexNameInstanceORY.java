package org.swtk.commons.dict.wordnet.indexbyname.instance.o.r.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceORY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"orycteropodidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02085150\"]}");
	add("{\"term\":\"orycteropus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02085284\"]}");
	add("{\"term\":\"orycteropus afer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02085443\"]}");
	add("{\"term\":\"oryctolagus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02327369\"]}");
	add("{\"term\":\"oryctolagus cuniculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02327502\"]}");
	add("{\"term\":\"oryx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02430995\"]}");
	add("{\"term\":\"oryx gazella\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02431154\"]}");
	add("{\"term\":\"oryza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12146299\"]}");
	add("{\"term\":\"oryza sativa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12146601\"]}");
	add("{\"term\":\"oryzomys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02343173\"]}");
	add("{\"term\":\"oryzomys palustris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02343292\"]}");
	add("{\"term\":\"oryzopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12146755\"]}");
	add("{\"term\":\"oryzopsis hymenoides\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12147033\"]}");
	add("{\"term\":\"oryzopsis miliacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12147253\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }