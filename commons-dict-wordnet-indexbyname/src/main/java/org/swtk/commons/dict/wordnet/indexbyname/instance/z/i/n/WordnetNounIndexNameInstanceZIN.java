package org.swtk.commons.dict.wordnet.indexbyname.instance.z.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceZIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"zinacef\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02993558\"]}");
	add("{\"term\":\"zinc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14686156\"]}");
	add("{\"term\":\"zinfandel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07914308\", \"13168163\"]}");
	add("{\"term\":\"zing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04642839\", \"07415301\"]}");
	add("{\"term\":\"zinger\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07297400\"]}");
	add("{\"term\":\"zingiber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12376111\"]}");
	add("{\"term\":\"zingiberaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12375837\"]}");
	add("{\"term\":\"zinjanthropus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02479818\"]}");
	add("{\"term\":\"zinkenite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15133464\"]}");
	add("{\"term\":\"zinnemann\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11427170\"]}");
	add("{\"term\":\"zinnia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12054610\"]}");
	add("{\"term\":\"zinnwaldite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15133583\"]}");
	add("{\"term\":\"zinsser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11427297\"]}");
	add("{\"term\":\"zinzendorf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11427460\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }