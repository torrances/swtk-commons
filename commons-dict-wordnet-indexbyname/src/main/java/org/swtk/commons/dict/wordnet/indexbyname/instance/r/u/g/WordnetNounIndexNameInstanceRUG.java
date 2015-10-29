package org.swtk.commons.dict.wordnet.indexbyname.instance.r.u.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRUG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rug\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04125115\"]}");
	add("{\"term\":\"rug beater\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02970859\"]}");
	add("{\"term\":\"rug merchant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10561611\"]}");
	add("{\"term\":\"rug pad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02971078\"]}");
	add("{\"term\":\"ruga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05615026\"]}");
	add("{\"term\":\"rugby\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00472041\"]}");
	add("{\"term\":\"rugby ball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04125632\"]}");
	add("{\"term\":\"rugby football\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00472041\"]}");
	add("{\"term\":\"rugelach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07954026\"]}");
	add("{\"term\":\"rugged individualism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05972166\"]}");
	add("{\"term\":\"ruggedisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00831382\"]}");
	add("{\"term\":\"ruggedization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00831382\"]}");
	add("{\"term\":\"ruggedness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04717864\", \"04779627\", \"05038369\"]}");
	add("{\"term\":\"ruggelach\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07954026\"]}");
	add("{\"term\":\"rugger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00472041\"]}");
	add("{\"term\":\"rugulah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07954026\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }