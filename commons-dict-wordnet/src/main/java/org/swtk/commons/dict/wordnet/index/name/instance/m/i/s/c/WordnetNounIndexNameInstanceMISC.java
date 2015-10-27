package org.swtk.commons.dict.wordnet.index.name.instance.m.i.s.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMISC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"miscalculation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00073628\"]}");
	add("{\"term\":\"miscarriage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00231342\", \"07334252\"]}");
	add("{\"term\":\"miscegenation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00851398\"]}");
	add("{\"term\":\"miscellanea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08415730\"]}");
	add("{\"term\":\"miscellany\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06604903\", \"08415730\"]}");
	add("{\"term\":\"mischance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07329027\", \"11447956\"]}");
	add("{\"term\":\"mischief\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04853764\", \"00737673\"]}");
	add("{\"term\":\"mischievousness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00737673\", \"04657367\", \"04916740\"]}");
	add("{\"term\":\"misconception\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05902260\"]}");
	add("{\"term\":\"misconduct\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00734044\", \"01136651\"]}");
	add("{\"term\":\"misconstrual\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07189528\"]}");
	add("{\"term\":\"misconstruction\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06325026\", \"07189528\"]}");
	add("{\"term\":\"miscount\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00654962\"]}");
	add("{\"term\":\"miscreant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10541917\"]}");
	add("{\"term\":\"miscreation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07381691\"]}");
	add("{\"term\":\"miscue\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00074648\", \"00501938\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }