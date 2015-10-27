package org.swtk.commons.dict.wordnet.index.name.instance.f.a.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFALL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fall\", \"synsetCount\":12, \"upperType\":\"NOUN\", \"ids\":[\"05119135\", \"07376986\", \"07486511\", \"15194468\", \"00068527\", \"07384870\", \"07442328\", \"00758272\", \"09288526\", \"07493671\", \"00077704\", \"15261656\"]}");
	add("{\"term\":\"falla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10985828\"]}");
	add("{\"term\":\"fallaciousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04817979\"]}");
	add("{\"term\":\"fallacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05902523\"]}");
	add("{\"term\":\"fallal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02790458\"]}");
	add("{\"term\":\"fallback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00058126\"]}");
	add("{\"term\":\"fallboard\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03323928\"]}");
	add("{\"term\":\"faller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10096558\", \"10295742\"]}");
	add("{\"term\":\"fallibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04813740\"]}");
	add("{\"term\":\"falloff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13577712\"]}");
	add("{\"term\":\"fallopio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10985958\"]}");
	add("{\"term\":\"fallopius\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10985958\"]}");
	add("{\"term\":\"fallot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10986137\"]}");
	add("{\"term\":\"fallout\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"11437501\", \"14883101\"]}");
	add("{\"term\":\"fallow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09301201\"]}");
	add("{\"term\":\"falls\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09498422\", \"12436270\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }