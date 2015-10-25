package org.swtk.commons.dict.wiktionary.generated.e.s.s;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryESS000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("essayer", "{\"term\":\"essayer\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|essay|er|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who performs an essay; an experimenter\", \"priority\":1}]}, \"synonyms\":{}}");

	add("essayist", "{\"term\":\"essayist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|essay|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who composes essays; a writer of short compositions\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"She was an \u0027\u0027essayist\u0027\u0027 whose frequent contributions to the editorial pages of major newspapers had a loyal following\", \"priority\":2}]}, \"synonyms\":{}}");

	add("essex", "{\"term\":\"essex\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A maritime county of England bordered by the North Sea, Suffolk, Cambridgeshire, Hertfordshire and Greater London, and separated from Kent by the Thames estuary\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A town in Connecticu\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A village in Illinoi\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A city in Iow\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A city in Missour\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A town in New Yor\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A town and county in Ontario, Canad\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A town in Vermont\", \"priority\":8}]}, \"synonyms\":{}}");

	add("essence", "{\"term\":\"essence\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"French\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"{{PIE root|en|h₁es}}From French \u0027lang\u003dfr\u0027 from Latin \u0027essentia\u0027 (the being or essence of a thing) from an artificial formation of \u0027esse\u0027 () to translate Ancient greek (to 1453) \u0027οὐσία\u0027 (being) from \u0027ὤν\u0027 present participle of \u0027εἰμί\u0027 (i am, exist)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The inherent nature of a thing or idea\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Lando\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The laws are at present, both in form and \u0027\u0027essence\u0027\u0027, the greatest curse that society labours under\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Addiso\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Gifts and alms are the expressions, not the \u0027\u0027essence\u0027\u0027 of this virtue [charity\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Courthorp\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027essence\u0027\u0027 of Addison\u0027s humour is irony\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"The true nature of anything, not accidental or illusory\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Constituent substance\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"Milto\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"Uncompounded is their \u0027\u0027essence\u0027\u0027 pure\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"A being; especially, a purely spiritual being\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"Milto\", \"priority\":13},{\"upperType\":\"NOUN\", \"text\":\"As far as gods and heavenly \u0027\u0027essences\u0027\u0027 / Can perish\", \"priority\":14},{\"upperType\":\"NOUN\", \"text\":\"Washington Irvin\", \"priority\":15},{\"upperType\":\"NOUN\", \"text\":\"He had been indulging in fanciful speculations on spiritual \u0027\u0027essences\u0027\u0027, until he had an ideal world of his own around him\", \"priority\":16},{\"upperType\":\"NOUN\", \"text\":\"A significant feature of something\", \"priority\":17},{\"upperType\":\"NOUN\", \"text\":\"The concentrated form of a plant or drug obtained through a distillation process\", \"priority\":18},{\"upperType\":\"NOUN\", \"text\":\"essence of Jojoba\", \"priority\":19},{\"upperType\":\"NOUN\", \"text\":\"Fragrance, a perfume\", \"priority\":20},{\"upperType\":\"NOUN\", \"text\":\"Alexander Pop\", \"priority\":21},{\"upperType\":\"NOUN\", \"text\":\"Nor let the \u0027\u0027essences\u0027\u0027 exhale\", \"priority\":22}]}, \"synonyms\":{}}");

	add("essentiality", "{\"term\":\"essentiality\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|essential|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of being essential; a basic set of essential traits; bein\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An essential thing\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }