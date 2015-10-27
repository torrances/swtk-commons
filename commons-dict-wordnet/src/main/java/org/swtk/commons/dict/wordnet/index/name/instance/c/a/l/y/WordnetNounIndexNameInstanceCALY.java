package org.swtk.commons.dict.wordnet.index.name.instance.c.a.l.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCALY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"calycanthaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11720870\"]}");
	add("{\"term\":\"calycanthus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11721145\"]}");
	add("{\"term\":\"calycle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02158100\", \"11712577\"]}");
	add("{\"term\":\"calycophyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12682634\"]}");
	add("{\"term\":\"calyculus\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02158100\", \"11712577\"]}");
	add("{\"term\":\"calymmatobacterium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01367763\"]}");
	add("{\"term\":\"calypso\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09513340\", \"12070031\"]}");
	add("{\"term\":\"calypter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02193117\"]}");
	add("{\"term\":\"calyptra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11552998\"]}");
	add("{\"term\":\"calystegia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12845669\"]}");
	add("{\"term\":\"calyx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11711992\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }