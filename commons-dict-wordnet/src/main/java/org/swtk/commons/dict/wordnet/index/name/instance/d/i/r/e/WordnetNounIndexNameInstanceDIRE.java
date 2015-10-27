package org.swtk.commons.dict.wordnet.index.name.instance.d.i.r.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDIRE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"direction\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"05712641\", \"07184131\", \"00816981\", \"06799486\", \"01135602\", \"06663446\", \"06206950\", \"13849639\", \"08697710\"]}");
	add("{\"term\":\"directionality\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05071022\", \"05073795\"]}");
	add("{\"term\":\"directive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07184731\"]}");
	add("{\"term\":\"directiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05074036\"]}");
	add("{\"term\":\"directivity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05074036\", \"05073795\"]}");
	add("{\"term\":\"directness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04878915\", \"04925387\"]}");
	add("{\"term\":\"director\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"09972018\", \"10107969\", \"10034960\", \"10035230\", \"10034684\"]}");
	add("{\"term\":\"directorate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08397499\"]}");
	add("{\"term\":\"directorship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00592973\"]}");
	add("{\"term\":\"directory\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06502442\", \"06435262\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }