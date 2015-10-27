package org.swtk.commons.dict.wordnet.index.name.instance.t.e.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTELL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10718145\"]}");
	add("{\"term\":\"teller\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"10365535\", \"10718466\", \"10718595\", \"11355036\"]}");
	add("{\"term\":\"tellima\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12823747\"]}");
	add("{\"term\":\"telling\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06818155\", \"07227084\", \"07237483\"]}");
	add("{\"term\":\"telltale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10712192\"]}");
	add("{\"term\":\"tellurian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10718758\"]}");
	add("{\"term\":\"telluride\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15092701\"]}");
	add("{\"term\":\"tellurium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14681407\"]}");
	add("{\"term\":\"tellus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09595427\"]}");
	add("{\"term\":\"telly\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04413042\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }