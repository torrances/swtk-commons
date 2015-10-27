package org.swtk.commons.dict.wordnet.index.name.instance.m.e.s.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMESH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mesh\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00141213\", \"03825135\", \"05739007\", \"07352714\", \"13676507\"]}");
	add("{\"term\":\"meshed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08931641\"]}");
	add("{\"term\":\"meshing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00141213\", \"03825135\", \"07352714\"]}");
	add("{\"term\":\"meshugaas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00514262\"]}");
	add("{\"term\":\"meshuggeneh\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10330183\"]}");
	add("{\"term\":\"meshuggener\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10330183\"]}");
	add("{\"term\":\"meshwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03825135\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }