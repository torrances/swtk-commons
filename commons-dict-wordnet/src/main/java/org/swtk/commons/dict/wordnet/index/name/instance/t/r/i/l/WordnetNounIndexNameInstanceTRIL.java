package org.swtk.commons.dict.wordnet.index.name.instance.t.r.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trilateral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13901977\"]}");
	add("{\"term\":\"trilby\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03330886\", \"10749219\"]}");
	add("{\"term\":\"trilisa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12048333\"]}");
	add("{\"term\":\"trill\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07148185\", \"06873227\"]}");
	add("{\"term\":\"trilliaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12488316\"]}");
	add("{\"term\":\"trilling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11369087\"]}");
	add("{\"term\":\"trillion\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13774583\", \"13774819\", \"13798632\"]}");
	add("{\"term\":\"trillionth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13761966\"]}");
	add("{\"term\":\"trillium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12488748\"]}");
	add("{\"term\":\"trilobite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01770885\"]}");
	add("{\"term\":\"trilogy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08002267\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }