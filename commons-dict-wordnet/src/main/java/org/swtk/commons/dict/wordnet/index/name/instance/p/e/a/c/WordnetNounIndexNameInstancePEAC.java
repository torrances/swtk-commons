package org.swtk.commons.dict.wordnet.index.name.instance.p.e.a.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePEAC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"peace\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"06786777\", \"14563126\", \"07531029\", \"13993147\", \"13993683\"]}");
	add("{\"term\":\"peaceableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13994031\"]}");
	add("{\"term\":\"peacefulness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07531029\", \"13994031\"]}");
	add("{\"term\":\"peacekeeper\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03908459\", \"10429870\", \"10429991\"]}");
	add("{\"term\":\"peacekeeping\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00982990\"]}");
	add("{\"term\":\"peacemaker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02910981\", \"09971642\"]}");
	add("{\"term\":\"peacenik\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10047848\"]}");
	add("{\"term\":\"peacetime\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15318470\"]}");
	add("{\"term\":\"peach\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04978942\", \"07766980\", \"10633512\", \"12668806\"]}");
	add("{\"term\":\"peachick\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01808702\"]}");
	add("{\"term\":\"peachwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12509773\"]}");
	add("{\"term\":\"peacoat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03908834\"]}");
	add("{\"term\":\"peacock\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01808784\", \"02281909\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }