package org.swtk.commons.dict.wordnet.index.name.instance.t.y.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTYRO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tyro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10383612\"]}");
	add("{\"term\":\"tyrocidin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04513001\"]}");
	add("{\"term\":\"tyrocidine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04513001\"]}");
	add("{\"term\":\"tyrol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08865127\"]}");
	add("{\"term\":\"tyrolean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04513183\", \"09754455\"]}");
	add("{\"term\":\"tyrosine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15107333\"]}");
	add("{\"term\":\"tyrosinemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14193379\"]}");
	add("{\"term\":\"tyrothricin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04513420\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }