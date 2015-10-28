package org.swtk.commons.dict.wordnet.indexbyname.instance.f.o.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFOS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fosamax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02699243\"]}");
	add("{\"term\":\"fosbury\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10995579\"]}");
	add("{\"term\":\"fossa\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02139104\", \"02139275\", \"13894850\"]}");
	add("{\"term\":\"fosse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03781583\"]}");
	add("{\"term\":\"fossil\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09307495\", \"10042633\"]}");
	add("{\"term\":\"fossilisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00202118\", \"13504929\"]}");
	add("{\"term\":\"fossilist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10414485\"]}");
	add("{\"term\":\"fossilization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00202118\", \"13504929\"]}");
	add("{\"term\":\"fossilology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06083438\"]}");
	add("{\"term\":\"foster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10995792\"]}");
	add("{\"term\":\"fosterage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01131853\", \"07266874\"]}");
	add("{\"term\":\"fostering\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01131853\", \"07266874\"]}");
	add("{\"term\":\"fosterling\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10125849\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }