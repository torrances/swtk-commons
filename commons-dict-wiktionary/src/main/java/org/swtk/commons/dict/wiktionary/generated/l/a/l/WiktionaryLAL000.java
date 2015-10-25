package org.swtk.commons.dict.wiktionary.generated.l.a.l;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLAL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lalo", "{\"term\":\"lalo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The powdered leaves of the baobab tree, used in soups in Africa\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lalaland", "{\"term\":\"lalaland\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fictional, nonphysical place where people out of touch with reality live and where nonsensical ideas come from; often used sarcastically pertaining to where one\u0027s mind has gon\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Where have you been: \u0027\u0027Lalaland\u0027\u0027?\u0027 (said to a person whose mind was wandering\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"She lives out in \u0027\u0027Lalaland\u0027\u0027.\u0027 (said of a person considered out of touch with reality\", \"priority\":3}]}, \"synonyms\":{}}");

	add("lalang", "{\"term\":\"lalang\", \"etymology\":{\"influencers\":[], \"languages\":[\"chinook jargon\", \"French\"], \"text\":\"From French \u0027langue\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Imperata cylindrica\u0027, a panicoid grass\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lallation", "{\"term\":\"lallation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"the incorrect pronunciation of the letter \u0026quot;r\u0026quot; so that it sounds like an \u0026quot;l\u0026quot\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"baby-talk or gibberish\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lallygag", "{\"term\":\"lallygag\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"horseplay, fool fooling around\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A layabout, one who \u0027\u0027lallygags\", \"priority\":2}]}, \"synonyms\":{}}");

	add("lalochezia", "{\"term\":\"lalochezia\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) {{m|grc|λαλία||speech}} + {{m|grc|χέζω||to defecate}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The use of vulgar or foul language to relieve stress or pain\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lalophobia", "{\"term\":\"lalophobia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An irrational fear of speaking\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }