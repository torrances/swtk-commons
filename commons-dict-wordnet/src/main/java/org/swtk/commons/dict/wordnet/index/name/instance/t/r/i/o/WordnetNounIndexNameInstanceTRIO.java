package org.swtk.commons.dict.wordnet.index.name.instance.t.r.i.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTRIO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"trio\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"08002508\", \"08002640\", \"08264073\", \"07055341\", \"13766184\"]}");
	add("{\"term\":\"triode\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04491688\"]}");
	add("{\"term\":\"triolein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15104223\"]}");
	add("{\"term\":\"trionychidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01674515\"]}");
	add("{\"term\":\"trionyx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01674916\"]}");
	add("{\"term\":\"triopidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01998629\"]}");
	add("{\"term\":\"triops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01998745\"]}");
	add("{\"term\":\"triose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14713978\"]}");
	add("{\"term\":\"triostium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12700473\"]}");
	add("{\"term\":\"trioxide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15104492\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }