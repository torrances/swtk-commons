package org.swtk.commons.dict.wordnet.indexbyname.instance.e.c.h;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceECH {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"echelon\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03268385\", \"08289273\", \"13969830\"]}");
	add("{\"term\":\"echeneididae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02577282\"]}");
	add("{\"term\":\"echeneis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02577799\"]}");
	add("{\"term\":\"echeneis naucrates\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02577956\"]}");
	add("{\"term\":\"echidna\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01875042\", \"01875413\"]}");
	add("{\"term\":\"echidnophaga\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02190411\"]}");
	add("{\"term\":\"echidnophaga gallinacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02190552\"]}");
	add("{\"term\":\"echinacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11982577\"]}");
	add("{\"term\":\"echinocactus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11866026\"]}");
	add("{\"term\":\"echinocactus grusonii\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11866382\"]}");
	add("{\"term\":\"echinocereus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11866556\"]}");
	add("{\"term\":\"echinochloa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12138024\"]}");
	add("{\"term\":\"echinochloa crusgalli\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12138212\"]}");
	add("{\"term\":\"echinochloa frumentacea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12138429\"]}");
	add("{\"term\":\"echinococcosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14476880\"]}");
	add("{\"term\":\"echinococcus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01930569\"]}");
	add("{\"term\":\"echinoderm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02319359\"]}");
	add("{\"term\":\"echinoderm family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02318690\"]}");
	add("{\"term\":\"echinoderm genus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02318832\"]}");
	add("{\"term\":\"echinodermata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02319044\"]}");
	add("{\"term\":\"echinoidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02321567\"]}");
	add("{\"term\":\"echinops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11982969\"]}");
	add("{\"term\":\"echinus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03268551\"]}");
	add("{\"term\":\"echinus esculentus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02321960\"]}");
	add("{\"term\":\"echium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12840320\"]}");
	add("{\"term\":\"echium vulgare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12840488\"]}");
	add("{\"term\":\"echo\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"01023061\", \"04753847\", \"05018346\", \"07214950\", \"09572176\", \"05017985\"]}");
	add("{\"term\":\"echo chamber\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03268932\"]}");
	add("{\"term\":\"echo sounder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04266881\"]}");
	add("{\"term\":\"echo sounding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00156617\"]}");
	add("{\"term\":\"echocardiogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07017051\"]}");
	add("{\"term\":\"echocardiograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03268669\"]}");
	add("{\"term\":\"echocardiography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00833967\"]}");
	add("{\"term\":\"echoencephalogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07016923\"]}");
	add("{\"term\":\"echoencephalograph\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03268799\"]}");
	add("{\"term\":\"echoencephalography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00834132\"]}");
	add("{\"term\":\"echogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04267474\"]}");
	add("{\"term\":\"echography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00903487\"]}");
	add("{\"term\":\"echolalia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01020893\", \"07215081\"]}");
	add("{\"term\":\"echolocation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00156617\"]}");
	add("{\"term\":\"echovirus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01340974\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }