package org.swtk.commons.dict.wordnet.index.name.instance.r.e.f.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREFL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"reflation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13569553\"]}");
	add("{\"term\":\"reflectance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13610022\"]}");
	add("{\"term\":\"reflection\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"05017811\", \"06779826\", \"13807616\", \"04076088\", \"04754355\", \"06893299\", \"11523478\", \"05793513\"]}");
	add("{\"term\":\"reflectiveness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04668903\"]}");
	add("{\"term\":\"reflectivity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04668903\", \"05017811\", \"13610022\"]}");
	add("{\"term\":\"reflectometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04076278\"]}");
	add("{\"term\":\"reflector\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04075713\", \"04076388\"]}");
	add("{\"term\":\"reflex\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00865191\"]}");
	add("{\"term\":\"reflexion\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"04076088\", \"04754355\", \"05017811\", \"05793513\", \"06779826\", \"06893299\", \"11523478\"]}");
	add("{\"term\":\"reflexive\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06339200\"]}");
	add("{\"term\":\"reflexiveness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13821026\", \"13821457\"]}");
	add("{\"term\":\"reflexivity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13821026\", \"13821457\"]}");
	add("{\"term\":\"reflexology\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00661189\", \"06150648\"]}");
	add("{\"term\":\"reflux\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07416747\", \"14359409\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }