package org.swtk.commons.dict.wordnet.index.name.instance.v.i.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceVILL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"villa\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04542547\", \"04542665\", \"04542819\", \"11386400\"]}");
	add("{\"term\":\"village\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09145635\", \"08690476\", \"08243620\"]}");
	add("{\"term\":\"villager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10773110\"]}");
	add("{\"term\":\"villahermosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08764469\"]}");
	add("{\"term\":\"villain\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10773447\", \"10773214\"]}");
	add("{\"term\":\"villainage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13976275\"]}");
	add("{\"term\":\"villainess\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10773585\"]}");
	add("{\"term\":\"villainousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04860592\"]}");
	add("{\"term\":\"villainy\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00747161\", \"04860592\"]}");
	add("{\"term\":\"villard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11386653\"]}");
	add("{\"term\":\"villein\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10599987\"]}");
	add("{\"term\":\"villeinage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13264272\", \"13976275\"]}");
	add("{\"term\":\"villoma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14273563\"]}");
	add("{\"term\":\"villon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11386782\"]}");
	add("{\"term\":\"villus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01904133\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }