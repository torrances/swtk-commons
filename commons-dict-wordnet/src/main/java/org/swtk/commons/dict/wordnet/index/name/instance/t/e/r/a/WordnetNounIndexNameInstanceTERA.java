package org.swtk.commons.dict.wordnet.index.name.instance.t.e.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTERA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06996455\"]}");
	add("{\"term\":\"terabit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13651315\"]}");
	add("{\"term\":\"terabyte\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13650943\", \"13651137\"]}");
	add("{\"term\":\"teraflop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13628648\"]}");
	add("{\"term\":\"terahertz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15305326\"]}");
	add("{\"term\":\"teras\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01462749\"]}");
	add("{\"term\":\"teratogen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09479128\"]}");
	add("{\"term\":\"teratogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13587639\"]}");
	add("{\"term\":\"teratology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06088989\"]}");
	add("{\"term\":\"teratoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14274527\"]}");
	add("{\"term\":\"terazosin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04419685\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }