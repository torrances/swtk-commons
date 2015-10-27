package org.swtk.commons.dict.wordnet.index.name.instance.g.e.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGENT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gent\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08870492\", \"09927483\", \"10146723\"]}");
	add("{\"term\":\"gentamicin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03440292\"]}");
	add("{\"term\":\"genteelness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04820771\"]}");
	add("{\"term\":\"gentian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12314240\"]}");
	add("{\"term\":\"gentiana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12313936\"]}");
	add("{\"term\":\"gentianaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12310633\"]}");
	add("{\"term\":\"gentianales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12310261\"]}");
	add("{\"term\":\"gentianella\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"12314641\", \"12316077\"]}");
	add("{\"term\":\"gentianopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12316735\"]}");
	add("{\"term\":\"gentile\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"09698313\", \"09698424\", \"09698566\", \"10185987\"]}");
	add("{\"term\":\"gentility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04820771\"]}");
	add("{\"term\":\"gentlefolk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07964261\"]}");
	add("{\"term\":\"gentleman\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10765000\", \"10146810\"]}");
	add("{\"term\":\"gentleness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04918150\", \"05077022\"]}");
	add("{\"term\":\"gentlewoman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10008828\"]}");
	add("{\"term\":\"gentrification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00269668\"]}");
	add("{\"term\":\"gentry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08403944\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }